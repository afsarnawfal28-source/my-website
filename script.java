// Dapatkan elemen tombol dengan ID "tombol-pesan"
const tombolPesan = document.getElementById('tombol-pesan');

// Tambahkan "event listener" yang akan mendengarkan klik pada tombol
tombolPesan.addEventListener('click', function() {
    // Tampilkan pesan saat tombol diklik
    alert('🎉 Selamat! Anda telah menemukan pesan rahasia! 🎉');
});
particlesJS.load('particles-js', 'particles.json', function() {
  console.log('particles.js loaded - callback');
});